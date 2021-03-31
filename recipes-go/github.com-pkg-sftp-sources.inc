SRC_URI_append = " https://proxy.golang.org/github.com/pkg/sftp/@v/v1.13.0.zip;srcoutput=github.com/pkg/sftp;srcinput=github.com/pkg/sftp@v1.13.0;downloadfilename=github-com-pkg-sftp-1.13.0.zip;name=github-com-pkg-sftp"
SRC_URI[github-com-pkg-sftp.sha256sum] = "2292120b7a174493875109b85913928059917360aede24a3d17bd7c2465678dd"

MOD_LICENSE_append = " \
    BSD-2-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/pkg/sftp/LICENSE;md5=452fc5cc5a9127a0e828d73423d45035 \
"
