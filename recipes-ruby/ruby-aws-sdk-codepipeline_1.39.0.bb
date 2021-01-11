SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "38f15150208f396114503b9d5bf21ecf"
SRC_URI[sha256sum] = "14b3e8699ef070203304aae221f97bd3e12fc3f7dc89e0eaf09247b9e4cb80f6"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
