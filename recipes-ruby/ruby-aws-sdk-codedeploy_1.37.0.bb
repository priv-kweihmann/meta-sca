SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "cbfcd5958887a83ae63e1c7fdfcf1690"
SRC_URI[sha256sum] = "44bcf79cb304b0375f5f30aaf581055b38a00db55848cdf76f61f39556c51538"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
