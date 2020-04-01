SUMMARY = "Pure Go Postgres driver for database/sql"
HOMEPAGE = "https://github.com/lib/pq"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/lib/pq"

inherit go
inherit native
