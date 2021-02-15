SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d4b97f7d8dec2d4e5103dc37b42f470d"
SRC_URI[sha256sum] = "79b4b62e18139ede8366a61e23b38b8ca5c51b34c4a59ae8690a97304db3e806"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
