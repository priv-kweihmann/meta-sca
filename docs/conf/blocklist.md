# Global blocklist for tools

You can also exclude recipe from all or certain tools, therefore a blocklisting configuration exists.
To exclude __all__ tools from a recipe use the following variable

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:|
| SCA_BLOCKLIST | regular expression(s) | space separated list | ".*-native"

The effective configuration is a merge of the global blocklist and the tool specific blocklist.

## Tool specific blocklisting

See the specific tool configuration [here](module) for details.
The effective configuration is a merge of the global blocklist and the tool specific blocklist.
