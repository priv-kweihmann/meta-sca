# Filter findings to your specific needs

Before exporting any finding it's filtered by multiple means.

## Filter by severity

With the global variable **SCA_WARNING_LEVEL** you can filter out findings with low severity like "style"-issues.
This variable does configure a kind of threshold value, which has to be exceeded for the finding to be exported.

E.g. if you configure **SCA_WARNING_LEVEL** to __warning__, all findings with the severity = 'error' or 'warning' are exported.

## Filter by scope

You can additionally filter by the scope of a finding.

For each tool the specific findings are categorized to scope-level (security, functional or style).
By setting global variable **SCA_SCOPE_FILTER** you can configure which scope will be exported.

E.g. if you configure **SCA_SCOPE_FILTER** to __security__ only findings with the 'security' scope will be exported.
