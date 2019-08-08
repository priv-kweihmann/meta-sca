SUMMARY = "Pretty printing for Go values"
HOMEPAGE = "https://github.com/kr/pretty"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/kr/pretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/License;md5=9d305c2010c6891ee4f3cd42a562f78f"

DEPENDS += "github.com-kr-text-native"

inherit go
inherit native