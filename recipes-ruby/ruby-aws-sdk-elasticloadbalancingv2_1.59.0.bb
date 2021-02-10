SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "7eff1771c577760572d6202b9b02be2f"
SRC_URI[sha256sum] = "99add1bdd4661f4548bed2b51f257306d07b96ccd4b4a3276618e3cdec120b33"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
