SUMMARY = "NPM: find-root"
DESCRIPTION = "find the closest package.json"
HOMEPAGE = "https://github.com/js-n/find-root#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=28092dd68137217bd8d75bf649b1d8ce"

SRC_URI = "https://registry.npmjs.org/find-root/-/find-root-1.1.0.tgz"
SRC_URI[md5sum] = "4838524d2005af54494889c94def73cf"
SRC_URI[sha256sum] = "06e73caf9d5d5e562304de57a591835efa79e9d1da220ffba7d5b901127214d4"

NPM_PKGNAME = "find-root"

inherit npmhelper
inherit native
