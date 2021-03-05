SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6750d5e15902936bef8b61709af02fd9"
SRC_URI[sha256sum] = "171965af8c9ebd28605f1d49c43d4ba973e9a9871b2d040c0b504da07d437441"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
