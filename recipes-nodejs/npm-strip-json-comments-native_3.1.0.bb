SUMMARY = "NPM: strip-json-comments"
DESCRIPTION = "Strip comments from JSON. Lets you use comments in your JSON files!"
HOMEPAGE = "https://github.com/sindresorhus/strip-json-comments#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/strip-json-comments/-/strip-json-comments-3.1.0.tgz"
SRC_URI[md5sum] = "52d58cd0a6cfafaca99cfbc8f27232d3"
SRC_URI[sha256sum] = "5a93878a1076feb88bb0d9214649c9369c3d9062d9a78ee3459b796af66312b6"

NPM_PKGNAME = "strip-json-comments"

inherit npmhelper
inherit native
