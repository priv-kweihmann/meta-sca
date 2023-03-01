SRC_URI += "https://proxy.golang.org/github.com/spf13/afero/@v/v1.9.4.zip;srcoutput=github.com/spf13/afero;srcinput=github.com/spf13/afero@v1.9.4;downloadfilename=github-com-spf13-afero-1.9.4.zip;name=github-com-spf13-afero"
SRC_URI[github-com-spf13-afero.sha256sum] = "19cfde7dac1906c4cbd43e6957df4d341d9040592bcf84d8cf3c86ef45c06fe9"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/afero/LICENSE.txt;md5=920d76114a32b0fb75b3f2718c5a91be \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-afero-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-pubsub-sources.inc', '', 'cloud.google.com-go-pubsub-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-storage-sources.inc', '', 'cloud.google.com-go-storage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-google-cloud-go-testing-sources.inc', '', 'github.com-googleapis-google-cloud-go-testing-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-sftp-sources.inc', '', 'github.com-pkg-sftp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
