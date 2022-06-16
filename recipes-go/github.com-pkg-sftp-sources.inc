SRC_URI += "https://proxy.golang.org/github.com/pkg/sftp/@v/v1.13.5.zip;srcoutput=github.com/pkg/sftp;srcinput=github.com/pkg/sftp@v1.13.5;downloadfilename=github-com-pkg-sftp-1.13.5.zip;name=github-com-pkg-sftp"
SRC_URI[github-com-pkg-sftp.sha256sum] = "16dd30372f347f270d4afa26e34cdd666c584247c683659e6e54709027d9c28a"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pkg/sftp/LICENSE;md5=452fc5cc5a9127a0e828d73423d45035 \
"

GOSRC_INCLUDEGUARD += "github.com-pkg-sftp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kr-fs-sources.inc', '', 'github.com-kr-fs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
