SUMMARY = "NPM: git-diff-tree"
DESCRIPTION = "Shelling out to git-diff-tree(1) in a Node streamy fashion"
HOMEPAGE = "https://github.com/alessioalex/git-diff-tree"

DEPENDS = "npm-git-spawned-stream-native npm-pump-chain-native npm-split-transform-stream-native npm-through2-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=67;md5=477dfa54ede28e2f361e7db05941d7a7"

SRC_URI = "https://registry.npmjs.org/git-diff-tree/-/git-diff-tree-1.1.0.tgz"
SRC_URI[md5sum] = "c3c07beeffd7253fe77cbff760acfd07"
SRC_URI[sha256sum] = "c88762fa164fd4b4f89b8c2da63ecaf8dd0686e1a39335684914bf5ea09bce99"

NPM_PKGNAME = "git-diff-tree"

inherit npmhelper
inherit native
