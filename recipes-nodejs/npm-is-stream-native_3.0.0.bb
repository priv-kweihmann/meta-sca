SUMMARY = "NPM: is-stream"
DESCRIPTION = "Check if something is a Node.js stream"
HOMEPAGE = "https://github.com/sindresorhus/is-stream#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-stream/-/is-stream-3.0.0.tgz"
SRC_URI[md5sum] = "a737829921cef374cae820dbe09ddb46"
SRC_URI[sha256sum] = "dd2f394069eca660f0138e340d6d93a3dd93a0fcad0a8bda0234088454f3b9f3"

NPM_PKGNAME = "is-stream"

inherit npmhelper
inherit native
