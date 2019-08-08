SUMMARY = "Implements the wildcard file matching in Go"
HOMEPAGE = "https://github.com/mgechev/dots"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "18fa4c4b71cc044b836fdcf922b26c44962164e0"

GO_IMPORT = "github.com/mgechev/dots"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0"

inherit go
inherit native