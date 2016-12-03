package o_o.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class BashEntity implements Serializable {

	private static final long serialVersionUID = -9139250608519033260L;

	public String toString()
	{
		return ToStringBuilder.reflectionToString(this);
	}
}
