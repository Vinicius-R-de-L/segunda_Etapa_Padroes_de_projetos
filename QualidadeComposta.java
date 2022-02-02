public class QualidadeComposta implements Qualidade{
	private QualidadeSimples audio;
	private QualidadeSimples video;

	public QualidadeComposta(QualidadeSimples audio, QualidadeSimples video){
		this.audio = audio;
		this.video = video;
	}

	public String getQualidade(){
		if( !(audio.getQualidade().equals(video.getQualidade()))) {
			return audio.getQualidade() + "-" + video.getQualidade();
		}
		return audio.getQualidade();
	}

	public void setQualidade(String qualidade){
		this.audio = new QualidadeSimples(qualidade);
		this.video = new QualidadeSimples(qualidade);

	}
}