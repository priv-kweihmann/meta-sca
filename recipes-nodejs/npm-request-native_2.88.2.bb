SUMMARY = "NPM: request"
DESCRIPTION = "Simplified HTTP request client."
HOMEPAGE = "https://github.com/request/request#readme"

DEPENDS = "npm-aws-sign2-native npm-aws4-native npm-caseless-native npm-combined-stream-native npm-extend-native npm-forever-agent-native npm-form-data-native npm-har-validator-native npm-http-signature-native npm-is-typedarray-native npm-isstream-native npm-json-stringify-safe-native npm-mime-types-native npm-oauth-sign-native npm-performance-now-native npm-qs-native npm-safe-buffer-native npm-tough-cookie-native npm-tunnel-agent-native npm-uuid-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3f8ead5440d1c311b45be065d135d90"

SRC_URI = "https://registry.npmjs.org/request/-/request-2.88.2.tgz"
SRC_URI[md5sum] = "cd83737d819423733fc3fcc875093f10"
SRC_URI[sha256sum] = "e86dae884084b90a300096972f5954c815ebe5877c590df7fd170e8b71724242"

NPM_PKGNAME = "request"

inherit npmhelper
inherit native
