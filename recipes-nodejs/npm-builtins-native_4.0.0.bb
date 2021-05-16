SUMMARY = "NPM: builtins"
DESCRIPTION = "List of node.js builtin modules"
HOMEPAGE = "https://github.com/juliangruber/builtins#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=69aef5ffcb6a0882bae34c8ed4a21c57"

DEPENDS = "npm-semver-native"

SRC_URI = "https://registry.npmjs.org/builtins/-/builtins-4.0.0.tgz"
SRC_URI[md5sum] = "8ca6fa47bacd9f62005a5e241a93dbda"
SRC_URI[sha256sum] = "be99ad74e1ee69b7ff02b605036a91905cca69d28991bc0d265501db592de31c"

NPM_PKGNAME = "builtins"

inherit npmhelper
inherit native
