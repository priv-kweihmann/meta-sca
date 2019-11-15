# Global blacklist for tools

You can also exclude recipe from all or certain tools, therefore a blacklisting configuration exists.
To exclude __all__ tools from a recipe use the following variable

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:|
| SCA_BLACKLIST | regular expression(s) | space separated list | ".*-native"

The effective configuration is a merge of the global blacklist and the tool specific blacklist.

## Tool specific blacklisting

See the specific tool configuration [here](module) for details.
The effective configuration is a merge of the global blacklist and the tool specific blacklist.
