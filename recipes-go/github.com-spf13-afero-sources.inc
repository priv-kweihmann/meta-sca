SRC_URI += "https://proxy.golang.org/github.com/spf13/afero/@v/v1.9.5.zip;srcoutput=github.com/spf13/afero;srcinput=github.com/spf13/afero@v1.9.5;downloadfilename=github-com-spf13-afero-1.9.5.zip;name=github-com-spf13-afero"
SRC_URI[github-com-spf13-afero.sha256sum] = "d7446379962278db68ed46c4e151eda007fb09025b2ed94f0663f80e83ac0648"

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
