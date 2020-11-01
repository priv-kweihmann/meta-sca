SUMMARY = "Pure Go Postgres driver for database/sql"
HOMEPAGE = "https://github.com/lib/pq"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "f3b22b2cad9e4567803b7ffd9853b8acda021438"
GO_IMPORT = "github.com/lib/pq"

inherit gonative
inherit native
