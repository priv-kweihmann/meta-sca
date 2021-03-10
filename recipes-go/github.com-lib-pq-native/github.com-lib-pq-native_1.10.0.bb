SUMMARY = "Pure Go Postgres driver for database/sql"
HOMEPAGE = "https://github.com/lib/pq"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "072e83d238c297c71cab11154695af301010031e"
GO_IMPORT = "github.com/lib/pq"

do_compile_prepend() {
    # kerberos auth supposed to be optional
    # so it's safe to delete it here
    rm -rf ${S}/src/${GO_IMPORT}/auth/kerberos
}

export GO111MODULE = "auto"

inherit go
inherit native
