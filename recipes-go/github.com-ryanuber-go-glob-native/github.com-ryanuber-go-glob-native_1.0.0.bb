SUMMARY = "Basic string globs in golang"
HOMEPAGE = "https://github.com/ryanuber/go-glob"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d2c81b3028eb947731a58fb068c7dff4"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "51a8f68e6c24dc43f1e371749c89a267de4ebc53"
GO_IMPORT = "github.com/ryanuber/go-glob"

inherit go
inherit native
