SRC_URI += "https://proxy.golang.org/github.com/googleapis/google-cloud-go-testing/@v/v0.0.0-20210719221736-1c9a4c676720.zip;srcoutput=github.com/googleapis/google-cloud-go-testing;srcinput=github.com/googleapis/google-cloud-go-testing@v0.0.0-20210719221736-1c9a4c676720;downloadfilename=github-com-googleapis-google-cloud-go-testing-0.0.0-20210719221736-1c9a4c676720.zip;name=github-com-googleapis-google-cloud-go-testing"
SRC_URI[github-com-googleapis-google-cloud-go-testing.sha256sum] = "18f1d158d57805a172440020f3d2ea4c16b460cafe7ab3fe5c3ec7a66b44119e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/googleapis/google-cloud-go-testing/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-googleapis-google-cloud-go-testing-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-bigquery-sources.inc', '', 'cloud.google.com-go-bigquery-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datastore-sources.inc', '', 'cloud.google.com-go-datastore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-lint-sources.inc', '', 'golang.org-x-lint-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'honnef.co-go-tools-sources.inc', '', 'honnef.co-go-tools-sources.inc', d)}
