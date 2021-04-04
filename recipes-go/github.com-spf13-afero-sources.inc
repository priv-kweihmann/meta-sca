SRC_URI += "https://proxy.golang.org/github.com/spf13/afero/@v/v1.6.0.zip;srcoutput=github.com/spf13/afero;srcinput=github.com/spf13/afero@v1.6.0;downloadfilename=github-com-spf13-afero-1.6.0.zip;name=github-com-spf13-afero"
SRC_URI[github-com-spf13-afero.sha256sum] = "234791203d4bb7405bf5ef7f5cecc6e64fdfa9fc5a12d85b6ec7ecdb86cc0834"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/afero/LICENSE.txt;md5=920d76114a32b0fb75b3f2718c5a91be \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-afero-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-sftp-sources.inc', '', 'github.com-pkg-sftp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
