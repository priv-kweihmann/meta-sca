SUMMARY = "NPM: longest-streak"
DESCRIPTION = "Count the longest repeating streak of a character"
HOMEPAGE = "https://github.com/wooorm/longest-streak#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/longest-streak/-/longest-streak-3.0.0.tgz"
SRC_URI[md5sum] = "0e36b20704224a3128e5be9cc4ac8a68"
SRC_URI[sha256sum] = "f0e3cf49d3b33d7a4c44654f0d31c413024234c5e211d9c4923ab2a2b3ac5807"

NPM_PKGNAME = "longest-streak"

inherit npmhelper
inherit native
