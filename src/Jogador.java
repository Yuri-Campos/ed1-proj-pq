	public class Jogador implements Comparable<Jogador>{
	private String nome;
	private Integer pontuacao;
	private Integer energia;
	private Integer total;
	public Jogador(String jNome, Integer jPont, Integer stm)
	{
		nome = jNome;
		pontuacao = jPont;
		energia = stm;
		total = (pontuacao + energia)/2;
	}
	
	public String getNome()
	{
		return nome;
	}
	public Integer getTotal()
	{
		return total;
	}
	
	public boolean igual(Jogador outro)
	{
		return this.getTotal() == outro.getTotal();
	}
	public int compareTo(Jogador outro)
	{
		if(this.igual(outro))
		{
			return 0;
		}
		else if(getTotal() > outro.getTotal())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", total=" + total + "]";
	}

		
	
}
