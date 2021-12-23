SUMMARY = "NPM: https-proxy-agent"
DESCRIPTION = "An HTTP(s) proxy `http.Agent` implementation for HTTPS"
HOMEPAGE = "https://github.com/TooTallNate/node-https-proxy-agent#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=116;md5=f6b326f8dd7323be93eb2b14eeb1899c"

DEPENDS = "npm-agent-base-native \
           npm-debug-native"

SRC_URI = "https://registry.npmjs.org/https-proxy-agent/-/https-proxy-agent-5.0.0.tgz"
SRC_URI[md5sum] = "590c986fa43d2b8e2ee87a6a9a852d80"
SRC_URI[sha256sum] = "38abeb1ec25f4ddec2483ae6a613f81836815cb1fa9e9b2f5b43bc22995ef5a8"

NPM_PKGNAME = "https-proxy-agent"

inherit npmhelper
inherit native
