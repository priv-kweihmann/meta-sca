SUMMARY = "NPM: js-yaml"
DESCRIPTION = "YAML 1.2 parser and serializer"
HOMEPAGE = "https://github.com/nodeca/js-yaml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=effd621a9bf5d72d6a7e6ef819bf3afb"

DEPENDS = "npm-argparse-native \
           npm-esprima-native"

SRC_URI = "https://registry.npmjs.org/js-yaml/-/js-yaml-3.14.1.tgz"
SRC_URI[md5sum] = "2a522c3e23f7999abd8f852c012c20dd"
SRC_URI[sha256sum] = "935a5f5939a5d5f0d1c4d85e7bf8b8a42b432d8692a82bce611720b8d72dbeca"

NPM_PKGNAME = "js-yaml"

inherit npmhelper
inherit native
