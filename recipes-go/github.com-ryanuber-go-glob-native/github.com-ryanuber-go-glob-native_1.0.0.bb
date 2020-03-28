SUMMARY = "Basic string globs in golang"
HOMEPAGE = "https://github.com/ryanuber/go-glob"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/ryanuber/go-glob"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=d2c81b3028eb947731a58fb068c7dff4"

inherit go
inherit native
