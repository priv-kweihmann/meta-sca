SUMMARY = "RubyGem: aws-sdk-codecommit"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeCommit (CodeCommit)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f6113d05addf1c41377ebdbe66c3d6f5"
SRC_URI[sha256sum] = "e5d49ced84aac19542d8d279bef74db4db18354eb757fdb067ebd2ac0a79cf96"

GEM_NAME = "aws-sdk-codecommit"

inherit rubygems
