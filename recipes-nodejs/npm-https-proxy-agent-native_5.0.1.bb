SUMMARY = "NPM: https-proxy-agent"
DESCRIPTION = "An HTTP(s) proxy `http.Agent` implementation for HTTPS"
HOMEPAGE = "https://github.com/TooTallNate/node-https-proxy-agent#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=116;md5=f6b326f8dd7323be93eb2b14eeb1899c"

DEPENDS = "npm-agent-base-native \
           npm-debug-native"

SRC_URI = "https://registry.npmjs.org/https-proxy-agent/-/https-proxy-agent-5.0.1.tgz"
SRC_URI[md5sum] = "f1c8886a34b2a456aaa807ebedc5dbdf"
SRC_URI[sha256sum] = "6da16fb44331f2e5d30bd21bf880aa934c1ad4fe7da7187910ef2b2509712019"

NPM_PKGNAME = "https-proxy-agent"

inherit npmhelper
inherit native
