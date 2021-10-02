SUMMARY = "NPM: power-assert-context-reducer-ast"
DESCRIPTION = "append AST into power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=106;endline=107;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-acorn-es7-plugin-native \
           npm-acorn-native \
           npm-core-js-native \
           npm-espurify-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/power-assert-context-reducer-ast/-/power-assert-context-reducer-ast-1.2.0.tgz"
SRC_URI[md5sum] = "138673a839eb578c71a472bba8370e69"
SRC_URI[sha256sum] = "76df4164058b2b9ea5d376698a3a41f435c7688242351fb1ed3778a91c4577c4"

NPM_PKGNAME = "power-assert-context-reducer-ast"

inherit npmhelper
inherit native
