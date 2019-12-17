SUMMARY = "EditorConfig support in Go"
HOMEPAGE = "https://github.com/mvdan/editorconfig"

SRC_URI = "git://github.com/mvdan/editorconfig.git;protocol=https"
SRCREV = "890940e3f00e17dad9e1dc8a06b9dbf474b337e7"

GO_IMPORT = "mvdan.cc/editorconfig"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=5d1b329cf2d09f301b0d604f96046e5a"

inherit go
inherit native
