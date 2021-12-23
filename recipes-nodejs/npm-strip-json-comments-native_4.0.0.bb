SUMMARY = "NPM: strip-json-comments"
DESCRIPTION = "Strip comments from JSON. Lets you use comments in your JSON files!"
HOMEPAGE = "https://github.com/sindresorhus/strip-json-comments#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-json-comments/-/strip-json-comments-4.0.0.tgz"
SRC_URI[md5sum] = "648f4267150a9e9496d9733c299ec4d9"
SRC_URI[sha256sum] = "6adceada9136414c2fc3bc301713ab9c610c4cf3122baa8e01affd5c59b8e435"

NPM_PKGNAME = "strip-json-comments"

inherit npmhelper
inherit native
