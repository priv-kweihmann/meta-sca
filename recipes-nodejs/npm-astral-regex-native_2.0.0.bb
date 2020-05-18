SUMMARY = "NPM: astral-regex"
DESCRIPTION = "Regular expression for matching astral symbols"
HOMEPAGE = "https://github.com/kevva/astral-regex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=05240cd20679544d6e90fcff746425bc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/astral-regex/-/astral-regex-2.0.0.tgz"
SRC_URI[md5sum] = "c340e065615d957d2d50b88059fbee34"
SRC_URI[sha256sum] = "0be9fee4792e2d5795f982a76e3e98f8caf03fc1bc572924b60d463386dbe1e7"

NPM_PKGNAME = "astral-regex"

inherit npmhelper
inherit native
