SUMMARY = "NPM: builtins"
DESCRIPTION = "List of node.js builtin modules"
HOMEPAGE = "https://github.com/juliangruber/builtins#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=69aef5ffcb6a0882bae34c8ed4a21c57"

DEPENDS = "npm-semver-native"

SRC_URI = "https://registry.npmjs.org/builtins/-/builtins-5.0.1.tgz"
SRC_URI[md5sum] = "467720f106042c5f07d2cd28901753ab"
SRC_URI[sha256sum] = "85110154ebc8ba9d8ec7717ff9e1379547c04d018d6b553317d5a3ab0ce4edb7"

NPM_PKGNAME = "builtins"

inherit npmhelper
inherit native
