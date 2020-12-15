SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "38c9100ee5fbf133653ffad11ed0abd9"
SRC_URI[sha256sum] = "fcf61be94115cf460a5527eb2c7d88e6970c01c8c7421cf1ce99cdb32cec086e"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
