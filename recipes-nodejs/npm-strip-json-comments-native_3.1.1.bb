SUMMARY = "NPM: strip-json-comments"
DESCRIPTION = "Strip comments from JSON. Lets you use comments in your JSON files!"
HOMEPAGE = "https://github.com/sindresorhus/strip-json-comments#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-json-comments/-/strip-json-comments-3.1.1.tgz"
SRC_URI[md5sum] = "58e65c07bc47365a2acc9129b810130c"
SRC_URI[sha256sum] = "0213fe6b1c1c470cf5c60ffca0d362142117c8e303ffbcabbd9a4c4700b6ceed"

NPM_PKGNAME = "strip-json-comments"

inherit npmhelper
inherit native
