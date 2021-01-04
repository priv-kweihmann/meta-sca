SUMMARY = "TOML parser for Golang with reflection"
HOMEPAGE = "https://github.com/BurntSushi/toml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "3012a1dbe2e4bd1391d42b32f0577cb7bbc7f005"
GO_IMPORT = "github.com/BurntSushi/toml"

inherit go
inherit native
