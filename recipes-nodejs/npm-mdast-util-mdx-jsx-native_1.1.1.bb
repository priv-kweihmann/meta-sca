SUMMARY = "NPM: mdast-util-mdx-jsx"
DESCRIPTION = "mdast extension to parse and serialize MDX or MDX.js JSX"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-mdx-jsx#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-parse-entities-native \
           npm-stringify-entities-native \
           npm-types-estree-jsx-native \
           npm-types-mdast-native \
           npm-unist-util-remove-position-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-mdx-jsx/-/mdast-util-mdx-jsx-1.1.1.tgz"
SRC_URI[md5sum] = "5b20773a4bd1467db30d19e1644496eb"
SRC_URI[sha256sum] = "70acdfc318e2e63ca761ea71254b62caa39b026128628734f60e2b0e2531e3ab"

NPM_PKGNAME = "mdast-util-mdx-jsx"

inherit npmhelper
inherit native
