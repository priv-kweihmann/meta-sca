SUMMARY = "NPM: markdown-table"
DESCRIPTION = "Markdown tables"
HOMEPAGE = "https://github.com/wooorm/markdown-table#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/markdown-table/-/markdown-table-3.0.1.tgz"
SRC_URI[md5sum] = "629d15e91f39b8428f5a20afcd53e428"
SRC_URI[sha256sum] = "f2e7850cdf3144979eb6932d0bc7f24743a8cadd49d409e169de6a54d998ea44"

NPM_PKGNAME = "markdown-table"

inherit npmhelper
inherit native
