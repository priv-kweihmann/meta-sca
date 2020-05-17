SUMMARY = "NPM: json-parser"
DESCRIPTION = "JSON parser to parse JSON object and MAINTAIN comments."
HOMEPAGE = "https://github.com/kaelzhang/node-json-parser#readme"

DEPENDS = "npm-esprima-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=982cb25c0938491dede8c0edb76f2061"

SRC_URI = "https://registry.npmjs.org/json-parser/-/json-parser-1.1.5.tgz"
SRC_URI[md5sum] = "2f0f88b52158ba86517b3798e4474ffb"
SRC_URI[sha256sum] = "835096e18d79893842c9cdf44f932efd25cc093d13d16c543aa75975975c33b2"

S = "${WORKDIR}/package"

NPM_PKGNAME = "json-parser"

inherit npmhelper
inherit native
