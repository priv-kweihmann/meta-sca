SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "447da14fcd8ad33f41559aac7756b7be"
SRC_URI[sha256sum] = "85ac4ebac1efb767275071befdadc9ee1d611b29e479ede40a203957fb60b375"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
