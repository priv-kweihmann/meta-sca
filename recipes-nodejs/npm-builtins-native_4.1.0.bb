SUMMARY = "NPM: builtins"
DESCRIPTION = "List of node.js builtin modules"
HOMEPAGE = "https://github.com/juliangruber/builtins#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=69aef5ffcb6a0882bae34c8ed4a21c57"

DEPENDS = "npm-semver-native"

SRC_URI = "https://registry.npmjs.org/builtins/-/builtins-4.1.0.tgz"
SRC_URI[md5sum] = "acfcf183fc908309f27e3c92aa12b02a"
SRC_URI[sha256sum] = "e3eac043f01229de8b4b6f7052ca8e4d5acd92543430d7bae9983072ed3774d3"

NPM_PKGNAME = "builtins"

inherit npmhelper
inherit native
