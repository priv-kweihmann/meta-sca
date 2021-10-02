SRC_URI += "https://proxy.golang.org/github.com/pkg/sftp/@v/v1.13.4.zip;srcoutput=github.com/pkg/sftp;srcinput=github.com/pkg/sftp@v1.13.4;downloadfilename=github-com-pkg-sftp-1.13.4.zip;name=github-com-pkg-sftp"
SRC_URI[github-com-pkg-sftp.sha256sum] = "ff564a14f25614145553091c8f5b400b6de096d926efdbceb7ca41a160d8e212"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pkg/sftp/LICENSE;md5=452fc5cc5a9127a0e828d73423d45035 \
"

GOSRC_INCLUDEGUARD += "github.com-pkg-sftp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kr-fs-sources.inc', '', 'github.com-kr-fs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
