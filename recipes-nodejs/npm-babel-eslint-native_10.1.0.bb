SUMMARY = "NPM: babel-eslint"
DESCRIPTION = "Custom parser for ESLint"
HOMEPAGE = "https://github.com/babel/babel-eslint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c38b8b0ded9b97e222a98487b597252"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-traverse-native \
           npm-babel-types-native \
           npm-eslint-visitor-keys-native \
           npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/babel-eslint/-/babel-eslint-10.1.0.tgz"
SRC_URI[md5sum] = "2fb05e5a615ecad1486d3dba1ad9e404"
SRC_URI[sha256sum] = "f566d1c468eac9662e050012767e6c86acb9f9d1d6845dd6b2d5331f60908a00"

NPM_PKGNAME = "babel-eslint"

inherit npmhelper
inherit native
