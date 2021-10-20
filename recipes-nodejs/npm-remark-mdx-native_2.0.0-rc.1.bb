SUMMARY = "NPM: remark-mdx"
DESCRIPTION = "remark plugin to support MDX syntax"
HOMEPAGE = "https://mdxjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-mdx-native \
           npm-micromark-extension-mdxjs-native"

SRC_URI = "https://registry.npmjs.org/remark-mdx/-/remark-mdx-2.0.0-rc.1.tgz"
SRC_URI[md5sum] = "2d6add51217a1d31da07e041f97c7357"
SRC_URI[sha256sum] = "8be7429c49a07c931c5f1bcd9ffe8a903426c834cc31e781de2def917705691d"

NPM_PKGNAME = "remark-mdx"

inherit npmhelper
inherit native
