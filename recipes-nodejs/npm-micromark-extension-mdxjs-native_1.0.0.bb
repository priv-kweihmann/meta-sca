SUMMARY = "NPM: micromark-extension-mdxjs"
DESCRIPTION = "micromark extension to support MDX.js"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdxjs#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-micromark-extension-mdx-expression-native \
           npm-micromark-extension-mdx-jsx-native \
           npm-micromark-extension-mdx-md-native \
           npm-micromark-extension-mdxjs-esm-native \
           npm-micromark-util-combine-extensions-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-mdxjs/-/micromark-extension-mdxjs-1.0.0.tgz"
SRC_URI[md5sum] = "eeef43202af956ebfc498b47d24a3948"
SRC_URI[sha256sum] = "c3072a99a079c375a436948276fd6ecabb589dfa89d3fa2583b7e1ec67cf826c"

NPM_PKGNAME = "micromark-extension-mdxjs"

inherit npmhelper
inherit native
