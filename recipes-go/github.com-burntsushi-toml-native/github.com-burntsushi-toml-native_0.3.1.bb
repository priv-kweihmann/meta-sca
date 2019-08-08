SUMMARY = "TOML parser for Golang with reflection"
HOMEPAGE = "https://github.com/BurntSushi/toml"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/BurntSushi/toml"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0"

inherit go
inherit native