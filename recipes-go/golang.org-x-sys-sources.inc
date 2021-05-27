SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210525143221-35b2ab0089ea.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210525143221-35b2ab0089ea;downloadfilename=golang-org-x-sys-0.0.0-20210525143221-35b2ab0089ea.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "2810beb82f38e8fb9cf14f7c83338ba502ceb218b50f6b2255a5ae71e92a43df"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

